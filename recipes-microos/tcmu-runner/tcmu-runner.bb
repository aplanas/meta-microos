SUMMARY = "A userspace daemon that handles the LIO TCM-User backstore"
DESCRIPTION = "LIO is the SCSI target in the Linux kernel. It is entirely kernel \
code, and allows exported SCSI logical  units (LUNs) to be backed \
by regular files or block devices. But, if we want to get fancier with \
the capabilities of the device we're emulating, the kernel is not \
necessarily the right place. While there are userspace libraries for \
compression, encryption, and clustered storage solutions like \
Ceph or Gluster, these are not accessible from the kernel. \
 \
The TCMU userspace-passthrough backstore allows a userspace process to \
handle requests to a LUN. But since the kernel-user interface that \
TCMU provides must be fast and flexible, it is complex enough that \
we'd like to avoid each  userspace handler having to write boilerplate \
code. \
 \
tcmu-runner handles the messy details of the TCMU interface -- UIO, \
netlink, pthreads, and DBus -- and exports a more friendly C plugin \
module API. Modules using this API are called 'TCMU handlers'. Handler \
authors can write code just to handle the SCSI commands as desired, \
and can also link with whatever userspace libraries they like."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "3d8cf3393111a414d4f73e3e3f6126cc1344d054dafe8e2ed12ccfe7eeceb57e82afab4a80cefc4cd362290a4635dd17b19e0113ede337e92096ca333f92c181"

RPROVIDES:${PN} += "config(tcmu-runner) tcmu-runner tcmu-runner(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libkmod.so.2()(64bit) libkmod.so.2(LIBKMOD_5)(64bit) libtcmalloc.so.4()(64bit) libtcmu.so.2()(64bit) libtcmu2 libz.so.1()(64bit) logrotate systemd"

inherit rpm
