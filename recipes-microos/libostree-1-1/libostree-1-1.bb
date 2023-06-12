SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-1-1-2023.2-2.1.aarch64.rpm"
RPM_HASH = "3603a69273e5df9e0b391a87d2ab042381555040ba5f9a6e8f2780693ee2f6284b30f358aeecda8b606c5a40c469b8ec5bc0639e02ca60c23a511c62d050e1d8"

RPROVIDES:${PN} += "libostree-1-1 \
libostree-1-1(aarch-64) \
libostree-1.so.1()(64bit) \
libostree-1.so.1(LIBOSTREE_2016.14)(64bit) \
libostree-1.so.1(LIBOSTREE_2016.3)(64bit) \
libostree-1.so.1(LIBOSTREE_2016.4)(64bit) \
libostree-1.so.1(LIBOSTREE_2016.5)(64bit) \
libostree-1.so.1(LIBOSTREE_2016.6)(64bit) \
libostree-1.so.1(LIBOSTREE_2016.7)(64bit) \
libostree-1.so.1(LIBOSTREE_2016.8)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.1)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.10)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.11)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.12)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.13)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.14)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.15)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.2)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.3)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.4)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.6)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.7)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.8)(64bit) \
libostree-1.so.1(LIBOSTREE_2017.9)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.1)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.2)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.3)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.5)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.6)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.7)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.9)(64bit) \
libostree-1.so.1(LIBOSTREE_2019.2)(64bit) \
libostree-1.so.1(LIBOSTREE_2019.3)(64bit) \
libostree-1.so.1(LIBOSTREE_2019.4)(64bit) \
libostree-1.so.1(LIBOSTREE_2019.6)(64bit) \
libostree-1.so.1(LIBOSTREE_2020.1)(64bit) \
libostree-1.so.1(LIBOSTREE_2020.4)(64bit) \
libostree-1.so.1(LIBOSTREE_2020.7)(64bit) \
libostree-1.so.1(LIBOSTREE_2020.8)(64bit) \
libostree-1.so.1(LIBOSTREE_2021.1)(64bit) \
libostree-1.so.1(LIBOSTREE_2021.2)(64bit) \
libostree-1.so.1(LIBOSTREE_2021.3)(64bit) \
libostree-1.so.1(LIBOSTREE_2021.4)(64bit) \
libostree-1.so.1(LIBOSTREE_2021.5)(64bit) \
libostree-1.so.1(LIBOSTREE_2022.2)(64bit) \
libostree-1.so.1(LIBOSTREE_2022.4)(64bit) \
libostree-1.so.1(LIBOSTREE_2022.5)(64bit) \
libostree-1.so.1(LIBOSTREE_2022.7)(64bit) \
libostree-1.so.1(LIBOSTREE_2023.1)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcurl.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsodium.so.23()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libz.so.1()(64bit)"

inherit rpm
