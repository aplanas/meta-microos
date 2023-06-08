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

RPM_NAME = "python311-regex-2023.3.23-2.1.aarch64.rpm"
RPM_HASH = "26b7006a88e33cc1a3661bd4e6082ec78de2a85c537ca7634b8ae4822bfab265f24bc8221ec5b1f9baaa434297325f3e8475f35b3fef2b2d6bc7d25b44d67fac"

RPROVIDES:${PN} += "python3.11dist(regex) python311-regex python311-regex(aarch-64) python3dist(regex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
