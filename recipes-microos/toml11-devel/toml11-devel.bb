SUMMARY = "Development files for toml11"
DESCRIPTION = "toml11 is a C++ header-only toml parser/encoder depending only on \
C++ standard library. \
 \
  * It is compatible to the latest version of TOML v1.0.0. \
  * It is one of the most TOML standard compliant libraries, tested with the \
    language agnostic test suite for TOML parsers by BurntSushi. \
  * It shows highly informative error messages. \
  * It has configurable container. You can use any random-access containers \
    and key-value maps as backend containers. \
  * It optionally preserves comments without any overhead. \
  * It has configurable serializer that supports comments, inline tables, \
    literal strings and multiline strings. \
  * It supports user-defined type conversion from/into toml values. \
  * It correctly handles UTF-8 sequences, with or without BOM. \
 \
Development files for toml11."
LICENSE = "MIT"

PV = "3.7.1"

RPM_NAME = "toml11-devel-3.7.1-1.1.aarch64.rpm"
RPM_HASH = "2873207381fc19d6bc7b3313b6d804276aad6aa23bec69e824b14295026c63192f6d23d043dd83089c77f2ab85903dcf24e169e51d1ed209a8d2a513633c614f"

RPROVIDES:${PN} += "cmake(toml11) \
toml11-devel \
toml11-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
