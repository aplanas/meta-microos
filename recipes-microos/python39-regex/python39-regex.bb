SUMMARY = "Alternative regular expression module for Python"
DESCRIPTION = "An alternate regex implementation. It differs from 're' in that \
 \
* Zero-width matches are handled like in Perl and PCRE: \
  * ``.split`` will split a string at a zero-width match. \
  * ``.sub`` will handle zero-width matches correctly. \
* Inline flags apply to the end of the group or pattern, and they can \
  be turned off. \
* Nested sets and set operations are supported. \
* Case-insensitive matches in Unicode use full case-folding by \
  default."
LICENSE = "Apache-2.0"

PV = "2023.3.23"

RPM_NAME = "python39-regex-2023.3.23-2.1.aarch64.rpm"
RPM_HASH = "e907e3794e5da5caa8402db663399eb06fe56d159be9a978faf530b5e5343ff8014817cfe724eb4bc8b0c1f3e9c0cd5a568265888d54f11afb30d026f44becef"

RPROVIDES:${PN} += "python3.9dist(regex) python39-regex python39-regex(aarch-64) python3dist(regex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
