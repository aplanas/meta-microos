SUMMARY = "Libraries for multipath-tools"
DESCRIPTION = "libmpathpersist provides a C API for handling of SCSI persistent \
reservations for device-mapper multipath devices. libmpathcmd \
provides a C API for sending commands to a running multipathd \
instance."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & LGPL-2.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "libmpath0-0.9.5+68+suse.d1b6a1c-1.1.aarch64.rpm"
RPM_HASH = "ed4e7094af8e797a18287382ee2410af1dc34f27e9dbcb764842b218b9fb451816a5759445432a9981fd0a3f3f225531da60c3bb8fbb2d672a8d2f4c74dd4202"

RPROVIDES:${PN} += "libcheckcciss_tur.so()(64bit) libcheckdirectio.so()(64bit) libcheckemc_clariion.so()(64bit) libcheckhp_sw.so()(64bit) libcheckrdac.so()(64bit) libcheckreadsector0.so()(64bit) libchecktur.so()(64bit) libforeign-nvme.so()(64bit) libmpath0 libmpath0(aarch-64) libmpathcmd.so.0()(64bit) libmpathcmd.so.0(LIBMPATHCMD_1.0.0)(64bit) libmpathpersist.so.0()(64bit) libmpathpersist.so.0(LIBMPATHPERSIST_2.1.0)(64bit) libmpathpersist.so.0(__LIBMPATHPERSIST_INT_1.0.0)(64bit) libmpathutil.so.0()(64bit) libmpathutil.so.0(LIBMPATHCOMMON_1.0.0)(64bit) libmpathutil.so.0(LIBMPATHUTIL_1.0)(64bit) libmpathutil.so.0(LIBMPATHUTIL_1.1)(64bit) libmpathutil.so.0(LIBMPATHUTIL_1.2)(64bit) libmpathutil.so.0(LIBMULTIPATH_16.0.0)(64bit) libmpathvalid.so.0()(64bit) libmpathvalid.so.0(MPATH_1.0)(64bit) libmultipath.so.0()(64bit) libmultipath.so.0(LIBMPATHCOMMON_1.0.0)(64bit) libmultipath.so.0(LIBMULTIPATH_18.0.0)(64bit) libmultipath.so.0(LIBMULTIPATH_18.1.0)(64bit) libprioalua.so()(64bit) libprioconst.so()(64bit) libpriodatacore.so()(64bit) libprioemc.so()(64bit) libpriohds.so()(64bit) libpriohp_sw.so()(64bit) libprioiet.so()(64bit) libprioontap.so()(64bit) libpriopath_latency.so()(64bit) libpriorandom.so()(64bit) libpriordac.so()(64bit) libpriosysfs.so()(64bit) libprioweightedpath.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_110)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libdevmapper.so.1.03(DM_1_02_98)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.24)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) liburcu.so.8()(64bit)"

inherit rpm
