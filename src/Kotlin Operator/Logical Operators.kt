package `Kotlin Operator`


//  কোটলিনে লজিক্যাল অপারেটরগুলি ব্যবহার হয় যেসব সম্পর্কিত শর্তের সত্যতা নির্ধারণ করার জন্য। লজিক্যাল অপারেটরগুলি মূলত সত্য বা মিথ্যা এবং বৈশিষ্ট্যগুলির মধ্যে প্রেরণ বা ব্যবধান নির্ধারণ করে।
//
//কোটলিনে সাধারণত প্রয়োজনীয় লজিক্যাল অপারেটরগুলি হল:
//
//1. `&&` (লজিক্যাল এন্ড): এই অপারেটরটি দুইটি বুলিয়ান অপারেন্ড গ্রহণ করে এবং দুটি অপারেন্ড সত্য হলে সত্য ফলাফল প্রদান করে। অন্যথায়, মিথ্যা ফলাফল প্রদান করে। উদাহরণস্বরূপ, `a && b` যদি `a` এবং `b` উভয় সত্য হয়, তবে ফলাফল সত্য হবে।
//
//2. `||` (লজিক্যাল OR): এই অপারেটরটি দুইটি বুলিয়ান অপারেন্ড গ্রহণ করে এবং যেকোনো একটি অপারেন্ড সত্য হলে সত্য ফলাফল প্রদান করে। উদাহরণস্বরূপ, `a || b` যদি `a` অথবা `b` যেকোনোটি সত্য হয়, তবে ফলাফল সত্য হবে।
//
//3. `!` (লজিক্যাল নট): এই অপারেটরটি একটি বুলিয়ান অপারেন্ড গ্রহণ করে এবং অপারেন্ডের স্টেটমেন্টের বিপরীত সত্যতা ফলাফল প্রদান করে। অর্থাৎ, যদি অপারেন্ড মিথ্যা হয়, তবে এটি সত্য হবে এবং যদি অপারেন্ড সত্য হয়, তবে এটি মিথ্যা হবে। উদাহরণস্বরূপ, `!a` যদি `a` মিথ্যা হয়, তবে ফলাফল সত্য হবে।
//
// লজিক্যাল অপারেটরগুলি ব্যবহার হয় কন্ডিশনাল স্টেটমেন্টস, লুপ, এবং বিভিন্ন লজিক্যাল ভিত্তিতে প্রোগ্রামিং লজিকে। এগুলির ব্যবহারের উদাহরণ নিম্নে দেওয়া হল:
//
// এই উদাহরণে, `&&` অপারেটর দিয়ে দুইটি শর্ত যাচাই করা হচ্ছে, `||` অপারেটর দিয়ে দুইটি শর্তের মধ্যে অথবা সত্যতা যাচাই করা হচ্ছে এবং `!` অপারেটর দিয়ে একটি বিপরীত লজিক্যাল ফলাফল যাচাই করা হচ্ছে।

//
//var a = 10
//var b = 5
//var c = 2
//println(a>b && b<c)  // Logical And
//
//println(a>b || b<c)  //  Logical Or
//
//println(!(a>b))     //   Logical Not