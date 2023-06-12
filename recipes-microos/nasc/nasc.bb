SUMMARY = "Do maths like a normal person"
DESCRIPTION = "This is an application where you do calculations 'like a normal \
person'. It lets you type whatever you want, smartly figures out what \
computations are needed, and outputs an answer on the right pane. \
Then you can plug those answers in to future equations and if that \
answer changes, so does the equations it is used in."
LICENSE = "GPL-3.0-only"

PV = "0.5.4"

RPM_NAME = "nasc-0.5.4-2.18.aarch64.rpm"
RPM_HASH = "9e210d9a8573737c2e9ac18c8cc59e3e393ea624fea95bbf129bcdd87b282770c4d3694dd3dc06c9092244c8d68ab8440c03b7b793e429fed612458b740a61bc"

RPROVIDES:${PN} += "application() \
application(com.github.parnold-x.nasc.desktop) \
metainfo() \
metainfo(com.github.parnold-x.nasc.appdata.xml) \
nasc \
nasc(aarch-64)"
RDEPENDS:${PN} += "cln \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libqalculate.so.22()(64bit) \
libsoup-2.4.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
qalculate"

inherit rpm
