SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-2023.2-1.1.aarch64.rpm"
RPM_HASH = "cc26e103b1f4ef6221cb5bd4aa43fe9648d6a6dbfc6e2e3ce4310e0bd5f5a16806a5f745e60c8f2319a426e1c22d8febf35e89311a225800da92cd9beef12862"

RPROVIDES:${PN} += "libostree libostree(aarch-64) ostree"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.9)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libostree-1.so.1()(64bit) libostree-1.so.1(LIBOSTREE_2016.14)(64bit) libostree-1.so.1(LIBOSTREE_2016.3)(64bit) libostree-1.so.1(LIBOSTREE_2016.4)(64bit) libostree-1.so.1(LIBOSTREE_2016.5)(64bit) libostree-1.so.1(LIBOSTREE_2016.7)(64bit) libostree-1.so.1(LIBOSTREE_2016.8)(64bit) libostree-1.so.1(LIBOSTREE_2017.1)(64bit) libostree-1.so.1(LIBOSTREE_2017.10)(64bit) libostree-1.so.1(LIBOSTREE_2017.12)(64bit) libostree-1.so.1(LIBOSTREE_2017.13)(64bit) libostree-1.so.1(LIBOSTREE_2017.15)(64bit) libostree-1.so.1(LIBOSTREE_2017.4)(64bit) libostree-1.so.1(LIBOSTREE_2017.6)(64bit) libostree-1.so.1(LIBOSTREE_2017.7)(64bit) libostree-1.so.1(LIBOSTREE_2018.2)(64bit) libostree-1.so.1(LIBOSTREE_2018.3)(64bit) libostree-1.so.1(LIBOSTREE_2018.5)(64bit) libostree-1.so.1(LIBOSTREE_2018.6)(64bit) libostree-1.so.1(LIBOSTREE_2019.3)(64bit) libostree-1.so.1(LIBOSTREE_2019.4)(64bit) libostree-1.so.1(LIBOSTREE_2020.1)(64bit) libostree-1.so.1(LIBOSTREE_2020.4)(64bit) libostree-1.so.1(LIBOSTREE_2020.7)(64bit) libostree-1.so.1(LIBOSTREE_2020.8)(64bit) libostree-1.so.1(LIBOSTREE_2021.1)(64bit) libostree-1.so.1(LIBOSTREE_2021.3)(64bit) libostree-1.so.1(LIBOSTREE_2021.4)(64bit) libostree-1.so.1(LIBOSTREE_2021.5)(64bit) libostree-1.so.1(LIBOSTREE_2022.2)(64bit) libostree-1.so.1(LIBOSTREE_2022.5)(64bit) libostree-1.so.1(LIBOSTREE_2022.7)(64bit) libostree-1.so.1(LIBOSTREE_2023.1)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
