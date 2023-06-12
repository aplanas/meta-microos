SUMMARY = "Syslog-ng event logger library development files"
DESCRIPTION = "The EventLog library aims to be a replacement of the simple syslog() \
API provided on UNIX systems. The major difference between EventLog and \
syslog is that EventLog tries to add structure to messages. \
 \
EventLog provides an interface to build, format and output an event \
record. The exact format and output method can be customized by the \
administrator via a configuration file. \
 \
This package provides the development files. The package may contain \
Novell/SUSE specific modifications/extensions, please report problems \
using Bugzilla at https://bugzilla.novell.com/ before you contact the \
authors. \
 \
The official home page of syslog-ng is: \
http://www.balabit.com/network-security/syslog-ng/"
LICENSE = "BSD-3-Clause"

PV = "0.2.13"

RPM_NAME = "libevtlog-devel-0.2.13-2.23.aarch64.rpm"
RPM_HASH = "0629afc1c88a97c1514fafcf0098dd51449c5e6a14c615fdaed06e7efab6087d006c5a67401921f7fca3ef6eef978750c091d5be77393d009d3658cd02399741"

RPROVIDES:${PN} += "libevtlog-devel \
libevtlog-devel(aarch-64) \
pkgconfig(eventlog)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libevtlog0"

inherit rpm
