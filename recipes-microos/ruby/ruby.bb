SUMMARY = "An Interpreted Object-Oriented Scripting Language"
DESCRIPTION = "Ruby is an interpreted scripting language for quick and easy \
object-oriented programming.  It has many features for processing text \
files and performing system management tasks (as in Perl).  It is \
simple, straight-forward, and extensible. \
 \
* Ruby features: \
 \
- Simple Syntax \
 \
- *Normal* Object-Oriented features (class, method calls, for \
   example) \
 \
- *Advanced* Object-Oriented features(Mix-in, Singleton-method, for \
   example) \
 \
- Operator Overloading \
 \
- Exception Handling \
 \
- Iterators and Closures \
 \
- Garbage Collection \
 \
- Dynamic Loading of Object Files (on some architectures) \
 \
- Highly Portable (works on many UNIX machines; DOS, Windows, Mac, \
BeOS, and more)"
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ruby-3.2-1.1.aarch64.rpm"
RPM_HASH = "b088778d0a1b267b2954424068689beff0b29fb39dc881aaa16782d348b177a4fe6a8775cbbf7e99bf2260fac8d42a5a5b8070dc87a62716b75c221f19458a69"

RPROVIDES:${PN} += "ruby \
ruby(aarch-64) \
rubygems"
RDEPENDS:${PN} += "ruby3.2"

inherit rpm
