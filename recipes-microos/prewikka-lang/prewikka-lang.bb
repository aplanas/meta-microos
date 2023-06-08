SUMMARY = "Prewikka lang files"
DESCRIPTION = "Lang files for prewikka."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "prewikka-lang-5.2.0-2.7.noarch.rpm"
RPM_HASH = "f0707ca59d96bc8b43ad25daeecc13f4e81c55337f191399a71c15cabf246b4569f441ad0f34710fce0eeb873adc0393fbaf9fabd8ed247ac6ab5011ff88f8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(prewikka:de) locale(prewikka:en) locale(prewikka:es) locale(prewikka:fr) locale(prewikka:it) locale(prewikka:pl) locale(prewikka:pt_BR) locale(prewikka:ru) prewikka-lang"
RDEPENDS:${PN} += ""

inherit rpm
