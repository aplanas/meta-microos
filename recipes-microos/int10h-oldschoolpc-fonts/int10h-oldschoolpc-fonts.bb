SUMMARY = "Remakes of old computer hardware fonts"
DESCRIPTION = "This fontpack contains remakes of various type styles from text-mode \
era PCs — in modern Unicode-compatible TrueType form (plus straight \
bitmap versions). The main focus is on hardware character sets: the \
kind that's located in a ROM and shown by default when working in \
text (or graphics) mode. \
 \
[ Classic hardware text mode stretches the fonts to fit the screen! \
To recreate the same visuals of that, a stretch factor must be \
applied. For details, see ratio.txt inside the package. ]"
LICENSE = "CC-BY-SA-4.0"

PV = "2.2"

RPM_NAME = "int10h-oldschoolpc-fonts-2.2-1.8.noarch.rpm"
RPM_HASH = "3c3997c2d59e079d66f6d6d23abc57f6e55b6a144b57f23265a66c43b0fd6fb5a82e555ffd676ec6e336acb8a746f0b7a83acdbc97693ab43be1b3f0de20c6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(int10h-oldschoolpc-fonts) \
int10h-oldschoolpc-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
