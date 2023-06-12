SUMMARY = "Windowing and multimedia library"
DESCRIPTION = "Pyglet provides an object-oriented programming interface for \
developing games and other visually-rich applications."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.0.5"

RPM_NAME = "python39-pyglet-2.0.5-1.1.noarch.rpm"
RPM_HASH = "1f7903d197a2570b687dadfc7da3221227359ad5ec7b1415ff8db4869e838f5849436dc5efc810777d57eba3dae850cfed84465a09e97b9d98d1ed2503ced29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyglet) \
python39-pyglet \
python3dist(pyglet)"
RDEPENDS:${PN} += "Mesa-dri \
libxcb-glx0 \
python(abi) \
python39-Pillow \
python39-future \
python39-pypng"

inherit rpm
