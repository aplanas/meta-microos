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

PV = "2023.5.5"

RPM_NAME = "python310-regex-2023.5.5-1.1.aarch64.rpm"
RPM_HASH = "f2267703b7eacee4c0540f0679fb2d66db27c4104499edf682b44332207d6427f34f2ea2daf55fb8e61865372bff104591367d7aa16399b7224cf6530485c4d6"

RPROVIDES:${PN} += "python3-regex python3.10dist(regex) python310-regex python310-regex(aarch-64) python3dist(regex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
