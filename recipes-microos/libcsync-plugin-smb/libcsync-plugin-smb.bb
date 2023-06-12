SUMMARY = "SMB plugin for csync"
DESCRIPTION = "This plug-in allows applications using csync to synchronize with a \
Samba or Windows server."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-plugin-smb-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "c3392d40741a10bff82ddb47208549b51cd6c143c970f2c4f319adbdb4dfcd5a99b9b88e2a3f49e4639403a01a1dae7633850cfc7f94859ff610dad4adb9497a"

RPROVIDES:${PN} += "libcsync-plugin-smb \
libcsync-plugin-smb(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libcsync.so.0()(64bit) \
libcsync0 \
libsmbclient.so.0()(64bit) \
libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit)"

inherit rpm
