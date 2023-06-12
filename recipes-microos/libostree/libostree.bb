SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-2023.2-2.1.aarch64.rpm"
RPM_HASH = "48c6b8007ce1de517e79afecb76c201de37580750278c8da87c8490a37b5f7b0be45ec6540d6b99b018b1ff8a09628e1b68fda7eace275a305e21f83d2f6878d"

RPROVIDES:${PN} += "libostree libostree(aarch-64) ostree"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.9)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libostree-1.so.1()(64bit) libostree-1.so.1(LIBOSTREE_2016.14)(64bit) libostree-1.so.1(LIBOSTREE_2016.3)(64bit) libostree-1.so.1(LIBOSTREE_2016.4)(64bit) libostree-1.so.1(LIBOSTREE_2016.5)(64bit) libostree-1.so.1(LIBOSTREE_2016.7)(64bit) libostree-1.so.1(LIBOSTREE_2016.8)(64bit) libostree-1.so.1(LIBOSTREE_2017.1)(64bit) libostree-1.so.1(LIBOSTREE_2017.10)(64bit) libostree-1.so.1(LIBOSTREE_2017.12)(64bit) libostree-1.so.1(LIBOSTREE_2017.13)(64bit) libostree-1.so.1(LIBOSTREE_2017.15)(64bit) libostree-1.so.1(LIBOSTREE_2017.4)(64bit) libostree-1.so.1(LIBOSTREE_2017.6)(64bit) libostree-1.so.1(LIBOSTREE_2017.7)(64bit) libostree-1.so.1(LIBOSTREE_2018.2)(64bit) libostree-1.so.1(LIBOSTREE_2018.3)(64bit) libostree-1.so.1(LIBOSTREE_2018.5)(64bit) libostree-1.so.1(LIBOSTREE_2018.6)(64bit) libostree-1.so.1(LIBOSTREE_2019.3)(64bit) libostree-1.so.1(LIBOSTREE_2019.4)(64bit) libostree-1.so.1(LIBOSTREE_2020.1)(64bit) libostree-1.so.1(LIBOSTREE_2020.4)(64bit) libostree-1.so.1(LIBOSTREE_2020.7)(64bit) libostree-1.so.1(LIBOSTREE_2020.8)(64bit) libostree-1.so.1(LIBOSTREE_2021.1)(64bit) libostree-1.so.1(LIBOSTREE_2021.3)(64bit) libostree-1.so.1(LIBOSTREE_2021.4)(64bit) libostree-1.so.1(LIBOSTREE_2021.5)(64bit) libostree-1.so.1(LIBOSTREE_2022.2)(64bit) libostree-1.so.1(LIBOSTREE_2022.5)(64bit) libostree-1.so.1(LIBOSTREE_2022.7)(64bit) libostree-1.so.1(LIBOSTREE_2023.1)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
