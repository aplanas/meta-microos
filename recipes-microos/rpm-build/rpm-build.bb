SUMMARY = "Tools and Scripts to create rpm packages"
DESCRIPTION = "If you want to build a rpm, you need this package. It provides rpmbuild \
and requires some packages that are usually required."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-4.18.0-4.3.aarch64.rpm"
RPM_HASH = "0f91cd33457e08bf2822f4db8e9ee3ccdf10642707331ac257c8a3749aa28305ba9df2655ff938daaa68d30581a9ca64955f03dfd86588b6d6446f83f7178b67"

RPROVIDES:${PN} += "rpm-build rpm-build(aarch-64) rpm:/usr/bin/rpmbuild rpmbuild"
RDEPENDS:${PN} += "(rpm-build-perl if perl-base) (rpm-build-python if python3-base) /bin/bash /bin/sh /usr/bin/gzip binutils bzip2 coreutils cpio debugedit diffutils dwz file findutils gawk gcc gettext-tools glibc-devel glibc-locale-base grep ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) librpm.so.9()(64bit) librpmbuild.so.9()(64bit) librpmbuild9 librpmio.so.9()(64bit) make patch rpm sed systemd-rpm-macros tar util-linux which xz"

inherit rpm
