SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-gcc7-locale-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "6b6c98ac8aa237232a7ef6d10108590857b876e5baf789409676d5dc2092479dc5e204808ab4a04880f656017c23cc05df2cb73856f0bde3202ec970d81a0f2f"

RPROVIDES:${PN} += "libstdc++6-gcc7-locale libstdc++6-gcc7-locale(aarch-64) libstdc++6-locale locale(libstdc++6-gcc7:de) locale(libstdc++6-gcc7:fr)"
RDEPENDS:${PN} += ""

inherit rpm
