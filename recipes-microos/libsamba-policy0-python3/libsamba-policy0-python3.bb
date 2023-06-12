SUMMARY = "Active Directory Group Policy library"
DESCRIPTION = "This subpackage contains the python3 library for policy management."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "libsamba-policy0-python3-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "31c70df2a05d1a15e0a93db714cd088e18cd491712d6eeb2249543d2ce19daf22ee24e60d4020bc29cbe0ebbe05e5e2535aa6a0b0c74a05171f3205183f4052a"

RPROVIDES:${PN} += "libsamba-policy.cpython-310-aarch64-linux-gnu.so.0()(64bit) \
libsamba-policy.cpython-310-aarch64-linux-gnu.so.0(SAMBA_POLICY.CPYTHON_310_AARCH64_LINUX_GNU_0.0.1)(64bit) \
libsamba-policy0-python3 \
libsamba-policy0-python3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcli-ldap-common-samba4.so()(64bit) \
libcli-ldap-common-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcli-ldap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libdcerpc.so.0()(64bit) \
libdcerpc.so.0(DCERPC_0.0.1)(64bit) \
libgenrand-samba4.so()(64bit) \
libgenrand-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libldbsamba-samba4.so()(64bit) \
libldbsamba-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libndr.so.3()(64bit) \
libndr.so.3(NDR_0.0.1)(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-debug-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-hostconfig.so.0(SAMBA_HOSTCONFIG_0.0.1)(64bit) \
libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so()(64bit) \
libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-security-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-util.so.0()(64bit) \
libsamba-util.so.0(SAMBA_UTIL_0.0.1)(64bit) \
libsmbclient-raw-samba4.so()(64bit) \
libsmbclient-raw-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
