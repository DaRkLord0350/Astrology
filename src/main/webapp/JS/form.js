document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('form'); // Form selection
    const phoneInput = document.getElementById('phone'); // Phone input selection
    const whatsappInput = document.getElementById('whatsapp'); // WhatsApp input selection
    const errorMessage = document.getElementById('error-pho'); // Error message for phone input
    const error_2 = document.getElementById('error-wa'); // Error message for WhatsApp input

    phoneInput.addEventListener('input', function() {
        validatePhoneNumber(); // Validate phone input on change
    });

    whatsappInput.addEventListener('input', function() {
        validateWhatsappNumber(); // Validate WhatsApp input on change
    });

    form.addEventListener('submit', function(event) {
        const isPhoneValid = validatePhoneNumber();
        const isWhatsappValid = validateWhatsappNumber();
        if (!isPhoneValid || !isWhatsappValid) {
            event.preventDefault(); // Prevent form submission if any validation fails
        }
    });

    function validatePhoneNumber() {
        const phoneNumber = phoneInput.value;
        const isValidPhoneNumber = /^\d{10}$/.test(phoneNumber); // Regular expression for exactly 10 digits

        if (isValidPhoneNumber) {
            errorMessage.style.display = 'none'; // Hide error message if valid
            phoneInput.style.borderColor = ''; // Reset border color
        } else {
            errorMessage.style.display = 'inline'; // Show error message if invalid
            phoneInput.style.borderColor = 'red'; // Highlight the input border in red
        }

        return isValidPhoneNumber; // Return true if valid, false otherwise
    }

    function validateWhatsappNumber() {
        const whatsappNumber = whatsappInput.value;
        const isValidWhatsappNumber = /^\d{10}$/.test(whatsappNumber); // Use the same validation pattern if needed

        if (isValidWhatsappNumber) {
            error_2.style.display = 'none'; // Hide error message if valid
            whatsappInput.style.borderColor = ''; // Reset border color
        } else {
            error_2.style.display = 'inline'; // Show error message if invalid
            whatsappInput.style.borderColor = 'red'; // Highlight the input border in red
        }

        return isValidWhatsappNumber; // Return true if valid, false otherwise
    }
});
