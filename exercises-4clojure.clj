;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;; Problem #10: Intro to Maps

20

; In both hash-maps, the key b will return 20

;;; Problem #16: Hello World

format "Hello, %s!"

; When using format, you provide a string and an agrument with %s being the location that the argument will be placed.

;;; Problem #17: Sequences: map

'(6 7 8)

; This map added five to each number in the sequence that was provided as the argument.
; So the new list becomes '(6 7 8).

;;; Problem #18: Sequences: filter

'(6 7)

; This filter is looking for any numbers in the provided sequence that are greater than 5.
; So the new list only contains 6 and 7.

;;; Problem #20: Penultimate Element

#(first (take-last 2 %))

; take-last takes the last n items out of a collection. In this case, I took out the last two items
; and then took out the first item out of the last two to get the second to last.

;;; Problem #21: Nth Element

(fn [seq n] (first (nthnext seq n)))

; nthnext takes the n next out of the sequence. So I use nthnext and take the first item out of the nthnext to get
; the nth.

;;; Problem #23: Reverse a sequence

#(reduce conj () %)

; conj items into a list puts them at the beginning of the list and reduce does the conjoining one item at a time.
; So this causes all the items to be reversed in the list.

;;; Problem #25: Find the odd numbers

filter odd?

; This just filters out every number that is odd out of a list.

;;; Problem #37: Regular Expressions

"ABC"

; The regular expression searches for any capital letters and it finds "ABC".

;;; Problem #40: Interpose a Seq

(fn [separator s] (rest (mapcat #(list separator %) s)))

; I made a function that takes a separator, separator, and a sequence, s. The mapcat will map
; and concat to each item in the given sequence. The anonymous function inside the other function 
; takes the separator and puts it before the items, one at a time. This leaves an extra separator in
; the front, so we use rest to get rid of the extra one.

;;; Problem #43: Reverse Interleave

(fn revinter[s n] (for [i (range n)] (take-nth n (drop i s))))

; The for loops goes through every number up to n. Then drop will drop the first i items in the 
; sequence s. Then take-nth will take every nth item from that sequence from drop.

;;; Problem #44: Rotate Sequence

(fn rotate[n s](take (count s) (drop (mod n (count s)) (cycle s))))

; cycle repeats the sequence an infinite amount of times. Then the drop mod portion will
; get rid of the desired amount of items of the front to get the correct rotation.
; And finally, take will readjust the sequence back to the correct size.

;;; Problem #46: Flipping out

(fn flip[f] (fn [& args] (apply f (reverse args))))

; In this question, the arguments just in the wrong order. So using reverse to flip them around
; makes all the tests pass. And apply, applies the function to the reversed arguments.

;;; Problem #47: Contain Yourself

4

; For maps and sets, contains? looks to see if the value is in the sequence. For vectors, it will
; check if the indice exists.
