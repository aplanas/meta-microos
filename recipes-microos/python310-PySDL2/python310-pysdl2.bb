SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.14"

RPM_NAME = "python310-PySDL2-0.9.14-2.3.noarch.rpm"
RPM_HASH = "4ff1a2bd86eca0f76994afa3001907b9808e563658eb15262b8120c47c4e9dd1fab28008ee4458eb1dbb8aa0b736f9e65b2f7f82d6f928aef9f0faeb27f67d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySDL2 \
python3.10dist(pysdl2) \
python310-PySDL2 \
python3dist(pysdl2)"
RDEPENDS:${PN} += "SDL2 \
SDL2_gfx \
SDL2_image \
SDL2_mixer \
SDL2_ttf \
python(abi)"

inherit rpm
