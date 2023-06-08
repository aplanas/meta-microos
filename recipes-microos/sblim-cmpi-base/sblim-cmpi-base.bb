SUMMARY = "SBLIM Base Instrumentation"
DESCRIPTION = "Standards Based Linux Instrumentation Base Providers"
LICENSE = "EPL-1.0"

PV = "1.6.4"

RPM_NAME = "sblim-cmpi-base-1.6.4-7.15.aarch64.rpm"
RPM_HASH = "e44b734735156db477fb46b3571ba581c1ff6ddf272a059bd15ee07fc1d63fa2de17b1a92fa25a1c75bfcdcbaf7369d332dc0395e2bc548b9473b2eafd2f6c03"

RPROVIDES:${PN} += "libcmpiOSBase_BaseBoardProvider.so()(64bit) libcmpiOSBase_CSBaseBoardProvider.so()(64bit) libcmpiOSBase_CSProcessorProvider.so()(64bit) libcmpiOSBase_Common.so.0()(64bit) libcmpiOSBase_ComputerSystemProvider.so()(64bit) libcmpiOSBase_OSProcessProvider.so()(64bit) libcmpiOSBase_OperatingSystemProvider.so()(64bit) libcmpiOSBase_OperatingSystemStatisticalDataProvider.so()(64bit) libcmpiOSBase_OperatingSystemStatisticsProvider.so()(64bit) libcmpiOSBase_ProcessorProvider.so()(64bit) libcmpiOSBase_RunningOSProvider.so()(64bit) libcmpiOSBase_UnixProcessProvider.so()(64bit) libdmiinfo.so.0()(64bit) sblim-cmpi-base sblim-cmpi-base(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig cim-schema cim-server ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libind_helper.so.0()(64bit)"

inherit rpm
