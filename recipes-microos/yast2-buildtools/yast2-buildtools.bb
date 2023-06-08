SUMMARY = "Minimal set of tools needed to build yast module"
DESCRIPTION = "Scripts and templates required for rebuilding the existing YaST2 \
modules and components (both ruby and C++)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-buildtools-4.6.1-1.1.noarch.rpm"
RPM_HASH = "ffb8f8e333da0d7ec599cebd14f73d96bec8e91f4a25c095f0b19c28bbbd981c99112d505934105a9216af1f241762f8021512074534da094f78c9611eebe96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(yast2-devtools) rpm_macro(yast_agentdir) rpm_macro(yast_build) rpm_macro(yast_check) rpm_macro(yast_ci_check) rpm_macro(yast_clientdir) rpm_macro(yast_configure) rpm_macro(yast_controldir) rpm_macro(yast_desktop_files) rpm_macro(yast_desktopdir) rpm_macro(yast_dir) rpm_macro(yast_docdir) rpm_macro(yast_execcompdir) rpm_macro(yast_fillupdir) rpm_macro(yast_icondir) rpm_macro(yast_imagedir) rpm_macro(yast_includedir) rpm_macro(yast_install) rpm_macro(yast_libdir) rpm_macro(yast_localedir) rpm_macro(yast_logdir) rpm_macro(yast_metainfo) rpm_macro(yast_metainfodir) rpm_macro(yast_moduledir) rpm_macro(yast_plugindir) rpm_macro(yast_prep) rpm_macro(yast_schemadir) rpm_macro(yast_scrconfdir) rpm_macro(yast_themedir) rpm_macro(yast_vardir) rpm_macro(yast_ybindir) rpm_macro(yast_ydatadir) rpm_macro(yast_yncludedir) rpm_macro(yast_ystartupdir) yast2-buildtools"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/perl /usr/bin/pkg-config autoconf automake gettext-tools perl perl-XML-Writer pkgconfig"

inherit rpm
