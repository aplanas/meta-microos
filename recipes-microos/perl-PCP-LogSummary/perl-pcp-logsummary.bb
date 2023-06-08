SUMMARY = "Performance Co-Pilot Perl bindings for processing pmlogsummary output"
DESCRIPTION = "The PCP::LogSummary module provides a Perl module for using the \
statistical summary data produced by the Performance Co-Pilot \
pmlogsummary utility.  This utility produces various averages, \
minima, maxima, and other calculations based on the performance \
data stored in a PCP archive.  The Perl interface is ideal for \
exporting this data into third-party tools (e.g. spreadsheets)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-LogSummary-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "de9c6ef62be59bd2fd7a4cc8631015fb8a4df7c4150089f047f4940898292117081d5d61cc7241ed2b1e3fb32c773a66042f51143d1a5ec5e0ef3ab997c8e169"

RPROVIDES:${PN} += "perl(PCP::LogSummary) perl-PCP-LogSummary perl-PCP-LogSummary(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env libpcp3 perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
