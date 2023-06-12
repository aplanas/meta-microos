SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs contains OCaml bindings for libguestfs. \
 \
This is for toplevel and scripting access only.  To compile OCaml \
programs which use libguestfs you will also need ocaml-libguestfs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "4003c86f560daba3ab2277193d50ceb6c769fdc44c7dde1d192219d29622b71032f51f969391962e2685262218f4eab4fb4eae544d5e6ffc34a1245f0c6b021b"

RPROVIDES:${PN} += "ocaml-libguestfs \
ocaml-libguestfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libguestfs \
libguestfs.so.0()(64bit)"

inherit rpm
