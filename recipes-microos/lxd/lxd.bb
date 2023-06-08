SUMMARY = "Container hypervisor based on LXC"
DESCRIPTION = "LXD is a system container manager. It offers a user experience \
similar to virtual machines but uses Linux containers (LXC) instead."
LICENSE = "Apache-2.0"

PV = "5.11"

RPM_NAME = "lxd-5.11-1.3.aarch64.rpm"
RPM_HASH = "a17087923a50dfd55ede406437480eefdd7dfcf9dd70e8c2e6350aa7b85ef8e685224bd4f6993ef3c50ad79056d9f66691073ce420ef34d2afdc86fa5bffe327"

RPROVIDES:${PN} += "config(lxd) group(lxd) lxd lxd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh acl dnsmasq ebtables kernel-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblxc.so.1()(64bit) liblz4.so.1()(64bit) libsqlite3.so.0()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libudev.so.1(LIBUDEV_189)(64bit) libudev.so.1(LIBUDEV_199)(64bit) libuv.so.1()(64bit) lxcfs lxcfs-hooks-lxc rsync squashfs sysuser-shadow tar xz"

inherit rpm
