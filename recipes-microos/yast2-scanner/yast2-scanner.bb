SUMMARY = "YaST2 - Scanner Configuration"
DESCRIPTION = "This package provides support for the configuration of USB scanners, \
SCSI scanners, scanners in HP all-in-one devices, and scanning via \
network (i.e. use a remote scanner via another host in the network). \
 \
Parallel port scanners and network scanners (i.e. a scanner which is \
directly accessible in the network) cannot be configured with this \
tool, except for such scanners in HP all-in-one devices. Usually those \
devices must be configured manually. For more information see \
http://www.sane-project.org/ and the documentation in the package \
'sane-backends'."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-scanner-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "2f80f6adc53101ab92b79e255c3dfbd9b4db1777444f2fca42cd7c466e1b414de4339582869bd7bba770c5555a6f4c146233130ab628a71e5837ba2cdc260961"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Scanner.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Scanner.metainfo.xml) \
yast2-scanner \
yast2-scanner(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
yast2 \
yast2-ruby-bindings"

inherit rpm
