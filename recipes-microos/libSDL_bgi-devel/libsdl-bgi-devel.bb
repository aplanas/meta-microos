SUMMARY = "Libraries, includes and more to develop SDL_bgi applications"
DESCRIPTION = "SDL_bgi is a Borland Graphics Interface (BGI) emulation library for \
SDL. It provides extensions for RGB colors and mouse support. \
 \
Unlike other BGI-compatible libraries, the purpose of SDL_bgi is not \
full compatibility with BGI. Rather, it is meant to be an \
introduction to SDL-based graphics: SDL and BGI commands can be mixed \
together."
LICENSE = "GPL-2.0-or-later & Zlib"

PV = "3.0.0"

RPM_NAME = "libSDL_bgi-devel-3.0.0-1.3.aarch64.rpm"
RPM_HASH = "e67c3b8ce88df82f251387e0dfc9eabc5db2e3abf96f5791c5d4893e4253e946a14b24c9ce885d631ce451cede9a82a8a8683564b573488f00ab63c7260dc9dd"

RPROVIDES:${PN} += "SDL_bgi-devel \
libSDL_bgi-devel \
libSDL_bgi-devel(aarch-64)"
RDEPENDS:${PN} += "libSDL_bgi-suse9"

inherit rpm
