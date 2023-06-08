SUMMARY = "Xen Virtualization: Headers and libraries for development"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the libraries and header files needed to create \
tools to control virtual machines. \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_02"

RPM_NAME = "xen-devel-4.17.1_02-1.1.aarch64.rpm"
RPM_HASH = "ce1ec38bd49827a18f040152808c1cb9baf31561f944b45117dcfe4b186877815d9a0c08124e6617f5a325c2906c153d6cfe5a15353c4ed26987b72217194648"

RPROVIDES:${PN} += "pkgconfig(xencall) pkgconfig(xencontrol) pkgconfig(xendevicemodel) pkgconfig(xenevtchn) pkgconfig(xenforeignmemory) pkgconfig(xengnttab) pkgconfig(xenguest) pkgconfig(xenhypfs) pkgconfig(xenlight) pkgconfig(xenstat) pkgconfig(xenstore) pkgconfig(xentoolcore) pkgconfig(xentoollog) pkgconfig(xenvchan) pkgconfig(xlutil) xen-devel xen-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libuuid-devel pkgconfig(xencall) pkgconfig(xencontrol) pkgconfig(xendevicemodel) pkgconfig(xenevtchn) pkgconfig(xenforeignmemory) pkgconfig(xengnttab) pkgconfig(xenguest) pkgconfig(xenhypfs) pkgconfig(xenlight) pkgconfig(xenstore) pkgconfig(xentoolcore) pkgconfig(xentoollog) xen-libs"

inherit rpm
