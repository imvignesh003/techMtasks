function incrementLikes(button) {
    let likeSpan = button.querySelector('.likeCount');
    let currentLikes = parseInt(likeSpan.textContent);
    likeSpan.textContent = currentLikes + 1;
}

const images = document.querySelectorAll('.image-container img');
images.forEach(image => {
    image.addEventListener('mouseover', () => {
        image.style.border = '3px solid rgba(0, 0, 0, 0.3)';
    });
    image.addEventListener('mouseout', () => {
        image.style.border = 'none';
    });
});