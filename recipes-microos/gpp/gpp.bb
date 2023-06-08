SUMMARY = "Generic Preprocessor"
DESCRIPTION = "GPP is a general-purpose preprocessor with customizable syntax, suitable \
for a wide range of preprocessing tasks. Its independence from any one \
programming language makes it much more versatile than the C preprocessor \
(cpp), while its syntax is lighter and more flexible than that of GNU m4. \
There are built-in macros for use with C/C++, LaTeX, HTML, XHTML, and \
Prolog files."
LICENSE = "LGPL-3.0+"

PV = "2.27"

RPM_NAME = "gpp-2.27-1.11.aarch64.rpm"
RPM_HASH = "e8075c405f087dd3d7d5c83c69eef98cf883660563e5625c05ad026c092825989769576dccd423406971df18c98e23171e293bea1d3e32a3fc31d9a1212a6f57"

RPROVIDES:${PN} += "gpp gpp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
