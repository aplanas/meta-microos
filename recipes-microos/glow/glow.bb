SUMMARY = "Render markdown on the CLI"
DESCRIPTION = "Glow is a terminal based markdown reader designed from the ground up to bring \
out the beauty—and power—of the CLI. \
 \
Use it to discover markdown files, read documentation directly on the command \
line and stash markdown files to your own private collection so you can read \
them anywhere. Glow will find local markdown files in subdirectories or a local \
Git repository."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "glow-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "ed8e73126b9776a0e7413331617e6ef150a5749daab00cc29811832d1f692fd394ff56fa409cb9255c9ebdb3b0e1011f69d1f3fb5e8e4eb5a5234b21125c1165"

RPROVIDES:${PN} += "glow glow(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
