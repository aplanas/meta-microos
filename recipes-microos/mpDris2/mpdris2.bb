SUMMARY = "MPRIS V2.1 support for mpd"
DESCRIPTION = "mpDris2 provide MPRIS 2 support to mpd (Music Player Daemon). mpDris2 is \
run in the user session and monitors a local or distant mpd server."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-0.9.1-1.1.noarch.rpm"
RPM_HASH = "5242a5c6f79d0914f764800948273755695aef5c68776f2531e1a68adc42393c8867559a311f1080da8cdbcfd29e61370e79c18d5b3463fd52c044f829e2bd38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(mpdris2.desktop) mpDris2"
RDEPENDS:${PN} += "/usr/bin/python3 perl(:MODULE_COMPAT_5.36.0) python3-python-mpd2 typelib(GLib) typelib(Notify)"

inherit rpm
