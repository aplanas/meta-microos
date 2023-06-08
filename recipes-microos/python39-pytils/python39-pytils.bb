SUMMARY = "A Russian-specific string utility module"
DESCRIPTION = "Tools for processing strings in Russian (choosing proper form for plurals, \
in-words representation of numerals, dates in Russian without locales, \
transliteration, etc.)"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-pytils-0.4.1-2.2.noarch.rpm"
RPM_HASH = "570db0ad3b50a238eded4ce1ac14cb2bba3e666a844a29aa4b61ebb9e3210904550b59ae6e3cb40ca396334e9a66fa43b710d7807e0838abcf75041d401f8fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytils) python39-pytils python3dist(pytils)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
