SUMMARY = "Python ctypes wrapper around SDL2"
DESCRIPTION = "PySDL2 is a pure Python wrapper around the SDL2, SDL2_mixer, SDL2_image, \
SDL2_ttf, and SDL2_gfx libraries. Instead of relying on C code, it uses \
the built-in ctypes module to interface with SDL2, and provides simple \
Python classes and wrappers for common SDL2 functionality."
LICENSE = "SUSE-Public-Domain"

PV = "0.9.14"

RPM_NAME = "python39-PySDL2-0.9.14-2.3.noarch.rpm"
RPM_HASH = "f5841b73e9d02db1d963ebdddc04702b8c227662fd25a9482caa0c8d80abe086b7bc0d2e0336b4221a30d3365fff542a3763d0e57a4bec4961f15a946b37d9c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pysdl2) python39-PySDL2 python3dist(pysdl2)"
RDEPENDS:${PN} += "SDL2 SDL2_gfx SDL2_image SDL2_mixer SDL2_ttf python(abi)"

inherit rpm
