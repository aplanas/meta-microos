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

RPM_NAME = "python311-regex-2023.5.5-1.1.aarch64.rpm"
RPM_HASH = "aacebe5a4da8d1ba32094b1aef98b529f00bf8304632dabde87f342a352891bddcc8e1e94ca42f95f33297f4715c7e5b65a0d268549c0a206da29039db9f233b"

RPROVIDES:${PN} += "python3.11dist(regex) \
python311-regex \
python311-regex(aarch-64) \
python3dist(regex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
