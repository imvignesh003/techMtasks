function getDiscount(isLoggedIn, membershipLevel, isCouponValid) {
    if (!isLoggedIn) return "No discount. Please log in.";
   
    let discount = membershipLevel === "Pro" ? 20 : 10;
    discount = isCouponValid ? discount + 3 : discount;

    return `Final discount: ${discount}%`;
}
console.log(getDiscount(true, "Pro", true));