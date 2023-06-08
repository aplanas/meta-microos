SUMMARY = "Userspace daemon that automatically binds workloads to NUMA nodes"
DESCRIPTION = "numad is a userspace daemon that monitors NUMA usage and resource usage \
and attempts to configure workloads using cpusets to use a subset of \
CPUs and memory nodes to maximise the number local memory access for \
best performance. Alternatively, it can be used to give hints as to how \
workloads should be manually bound to CPUs and memory nodes. This daemon \
is primarily intended for scenarios where there are multiple processes \
each which fit within a NUMA node. Examples of such configurations are \
virtual machine instances where each VM is smaller than a NUMA node \
or running multiple JVMs where each instance fits within a NUMA node. \
If the workload is one process that spans two or more nodes such as \
a large database server or a single JVM instance then numad is likely \
to regress performance."
LICENSE = "LGPL-2.1-only"

PV = "0.5.20130522"

RPM_NAME = "numad-0.5.20130522-8.7.aarch64.rpm"
RPM_HASH = "2dc73f456adcce40deeef95e6dd487710978ae0e60952d69f6d192c07d1214947bc65e8b85270f8e4a318042f81fd9d92b0215d5d7d484f858a1c2469fba22b8"

RPROVIDES:${PN} += "config(numad) numad numad(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
