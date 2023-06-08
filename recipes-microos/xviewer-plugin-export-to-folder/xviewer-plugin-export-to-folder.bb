SUMMARY = "Xviewer export to directory plugin"
DESCRIPTION = "xviewer export to directory plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-export-to-folder-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "ce78f7e4f3aacd45d44b45f48e88454ee39f0e8b889db289cb054475f81db29aa57d7dac27f9db12bd7c59170945e288c1f61c4394e4649bebc68e3cac7f59a1"

RPROVIDES:${PN} += "metainfo() metainfo(xviewer-export-to-folder.metainfo.xml) xviewer-plugin-export-to-folder xviewer-plugin-export-to-folder(aarch-64) xviewer-plugins:/usr/lib64/xviewer/plugins/export-to-folder.plugin"
RDEPENDS:${PN} += "/bin/sh typelib(GObject) typelib(Gio) typelib(Gtk) typelib(PeasGtk) typelib(Xviewer) xviewer-plugins-data"

inherit rpm
