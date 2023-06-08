SUMMARY = "SWIG example files"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more. \
 \
This package contains SWIG examples, useful both for testing and \
understandig SWIG usage."
LICENSE = "BSD-3-Clause"

PV = "4.1.1"

RPM_NAME = "swig-examples-4.1.1-2.3.aarch64.rpm"
RPM_HASH = "956adf02b9a443ad656925cbfd202ed6c65bfede81df4f3a651827799ee239efd552e9594dc7f7360e6cb3147fc8a49e6bf9e6cf6ae53f630e2443e346a7c454"

RPROVIDES:${PN} += "swig-examples swig-examples(aarch-64)"
RDEPENDS:${PN} += "swig"

inherit rpm
