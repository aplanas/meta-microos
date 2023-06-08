SUMMARY = "work around buggy code calling UNIVERSAL::can() as a function"
DESCRIPTION = "The UNIVERSAL class provides a few default methods so that all objects can \
use them. Object orientation allows programmers to override these methods \
in subclasses to provide more specific and appropriate behavior. \
 \
Some authors call methods in the UNIVERSAL class on potential invocants as \
functions, bypassing any possible overriding. This is wrong and you should \
not do it. Unfortunately, not everyone heeds this warning and their bad \
code can break your good code. \
 \
This module replaces 'UNIVERSAL::can()' with a method that checks to see if \
the first argument is a valid invocant has its own 'can()' method. If so, \
it gives a warning and calls the overridden method, working around buggy \
code. Otherwise, everything works as you might expect. \
 \
Some people argue that you must call 'UNIVERSAL::can()' as a function \
because you don't know if your proposed invocant is a valid invocant. \
That's silly. Use 'blessed()' from the Scalar::Util manpage if you want to \
check that the potential invocant is an object or call the method anyway in \
an 'eval' block and check for failure (though check the exception \
_returned_, as a poorly-written 'can()' method could break Liskov and throw \
an exception other than 'You can't call a method on this type of \
invocant'). \
 \
Just don't break working code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20140328"

RPM_NAME = "perl-UNIVERSAL-can-1.20140328-3.26.noarch.rpm"
RPM_HASH = "80131bdca1081fcdea6d707d7dd34784d38bce71c1dcbe38116119f488947dc4838e85d1a3323cf4f498d2f7977e8bc7fcc404797befd332a0d390d5dfd22d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(UNIVERSAL::can) perl-UNIVERSAL-can"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
