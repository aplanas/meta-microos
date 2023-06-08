SUMMARY = "A preprocessor compliant to C99"
DESCRIPTION = "ucpp is a preprocessor for C source code, specifically code compliant to the \
ISO standard 9899:1999, also known as C99. A preprocessor is responsible for \
macro replacement, conditional compilation and inclusion of header files. \
 \
ucpp operates in two modes: \
-- lexer mode: ucpp is linked to some other code and outputs a stream of \
tokens (each call to the lex() function will yield one token) \
-- non-lexer mode: ucpp preprocesses text and outputs the resulting text \
to a file descriptor; if linked to some other code, the cpp() function \
must be called repeatedly, otherwise ucpp is a stand-alone binary."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "ucpp-1.3.5-2.18.aarch64.rpm"
RPM_HASH = "3d2cd56234e4ffd5a665ddc409d0a40ca61846a99536b2ae8a6cc8b35d7eaafb0d4ce9cdc21e79191489c4384b76648c4a44537643e1525cfd5b3c2431c34288"

RPROVIDES:${PN} += "ucpp ucpp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libucpp.so.13()(64bit)"

inherit rpm
