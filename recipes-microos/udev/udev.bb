SUMMARY = "A rule-based device node and kernel event manager"
DESCRIPTION = "Udev creates and removes device nodes in /dev for devices discovered or \
removed from the system. It receives events via kernel netlink messages \
and dispatches them according to rules in /usr/lib/udev/rules.d/. Matching \
rules may name a device node, create additional symlinks to the node, \
call tools to initialize a device, or load needed kernel modules."
LICENSE = "GPL-2.0-only"

PV = "253.4"

RPM_NAME = "udev-253.4-1.2.aarch64.rpm"
RPM_HASH = "d689b6dbccd953cb9386f12c22557f83a533d3b65a24a7f346095e3299b1c41d914c1cd8c25a374f0dd0d46384a9ef46ccdbfb94e058cc84ba9d0fc3b16ca4dd"

RPROVIDES:${PN} += "config(udev) libcryptsetup-token-systemd-fido2.so()(64bit) libcryptsetup-token-systemd-fido2.so(CRYPTSETUP_TOKEN_1.0)(64bit) libcryptsetup-token-systemd-pkcs11.so()(64bit) libcryptsetup-token-systemd-pkcs11.so(CRYPTSETUP_TOKEN_1.0)(64bit) libcryptsetup-token-systemd-tpm2.so()(64bit) libcryptsetup-token-systemd-tpm2.so(CRYPTSETUP_TOKEN_1.0)(64bit) pkgconfig(udev) udev udev(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config coreutils filesystem group(kvm) kmod ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.18)(64bit) libblkid.so.1(BLKID_2_37)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcryptsetup.so.12()(64bit) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) libkmod.so.2()(64bit) libkmod.so.2(LIBKMOD_5)(64bit) libp11-kit.so.0()(64bit) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) sed system-group-hardware systemd"

inherit rpm
