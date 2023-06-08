SUMMARY = "report the search path for a class's ISA tree"
DESCRIPTION = "Suppose you have a class (like Food::Fish::Fishstick) that is derived, via \
its @ISA, from one or more superclasses (as Food::Fish::Fishstick is from \
Food::Fish, Life::Fungus, and Chemicals), and some of those superclasses \
may themselves each be derived, via its @ISA, from one or more superclasses \
(as above). \
 \
When, then, you call a method in that class ($fishstick->calories), Perl \
first searches there for that method, but if it's not there, it goes \
searching in its superclasses, and so on, in a depth-first (or maybe \
'height-first' is the word) search. In the above example, it'd first look \
in Food::Fish, then Food, then Matter, then Life::Fungus, then Life, then \
Chemicals. \
 \
This library, Class::ISA, provides functions that return that list -- the \
list (in order) of names of classes Perl would search to find a method, \
with no duplicates."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.36"

RPM_NAME = "perl-Class-ISA-0.36-10.26.noarch.rpm"
RPM_HASH = "9c7c31f164f8147b78ee155fcd21011ddd976c4f4a8d2a13cc28086b3ef98fc1cee21d52ba4bfacd290b7841b7b43de9a3fd2a505d9c32c2f65ba48b50e67279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::ISA) perl-Class-ISA"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
