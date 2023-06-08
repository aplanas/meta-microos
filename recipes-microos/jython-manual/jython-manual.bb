SUMMARY = "Manual for jython"
DESCRIPTION = "This package contains the manual for Jython. \
 \
Jython is an implementation of the high-level, dynamic, object-oriented \
language Python seamlessly integrated with the Java platform. The \
predecessor to Jython, JPython, is certified as 100% Pure Java. Jython \
is freely available for both commercial and non-commercial use and is \
distributed with source code. Jython is complementary to Java and is \
especially suited for the following tasks: Embedded scripting - Java \
programmers can add the Jython libraries to their system to allow end \
users to write simple or complicated scripts that add functionality to \
the application. Interactive experimentation - Jython provides an \
interactive interpreter that can be used to interact with Java packages \
or with running Java applications. This allows programmers to \
experiment and debug any Java system using Jython. Rapid application \
development - Python programs are typically 2-10X shorter than the \
equivalent Java program. This translates directly to increased \
programmer productivity. The seamless interaction between Python and \
Java allows developers to freely mix the two languages both during \
development and in shipping products."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "2.2.1"

RPM_NAME = "jython-manual-2.2.1-25.7.noarch.rpm"
RPM_HASH = "99f5e8b18e7e704d360a5147cf02b940eeaddb454eb18eca03d49589ea51f342ba85befa4722cabad9a1fbe0066a0e780e36a624b586c6863102c2f73656e67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jython-manual"
RDEPENDS:${PN} += ""

inherit rpm
