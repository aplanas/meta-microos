SUMMARY = "SWIG Manual"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more. \
 \
This package contains the SWIG manual."
LICENSE = "BSD-3-Clause"

PV = "4.1.1"

RPM_NAME = "swig-doc-4.1.1-2.3.noarch.rpm"
RPM_HASH = "aa6cfda6ad4701f51098944b364d044a4e5df8ac38ec11eed8f71049ca738ce266239d254d619aba849238d68db9e4efb706494430592aa45d09974a4ab2eef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swig-doc"
RDEPENDS:${PN} += "swig"

inherit rpm
