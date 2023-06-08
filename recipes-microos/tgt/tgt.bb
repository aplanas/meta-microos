SUMMARY = "Generic Linux target framework (tgt)"
DESCRIPTION = "Linux target framework (tgt) aims to simplify various SCSI target \
driver (iSCSI, Fibre Channel, SRP, etc) creation and maintenance. \
 \
Tgt consists of kernel modules, user-space daemon, and user-space \
tools. Some target drivers uses all of them and some use only \
user-space daemon and tools (i.e. they completely runs in user space)."
LICENSE = "GPL-2.0-only"

PV = "1.0.85"

RPM_NAME = "tgt-1.0.85-1.4.aarch64.rpm"
RPM_HASH = "68f6ef1d7d102dbc348846e70b65e15ffd81f210c0983ccced6b47346fa7290ffcf5ea04fcff0acb14366c35862f818bf062191140b2ad914b4bb7164ef7b82b"

RPROVIDES:${PN} += "config(tgt) tgt tgt(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch fillup libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libc.so.6(GLIBC_2.34)(64bit) perl-Config-General systemd"

inherit rpm
