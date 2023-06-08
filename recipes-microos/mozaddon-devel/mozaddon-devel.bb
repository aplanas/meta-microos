SUMMARY = "RPM macros for building Mozilla extensions under openSUSE"
DESCRIPTION = "XPI ID retrieval script and helpful RPM macros for packaging up \
addons for the Mozilla suite."
LICENSE = "SUSE-Public-Domain"

PV = "1"

RPM_NAME = "mozaddon-devel-1-2.6.noarch.rpm"
RPM_HASH = "91d536a0d177958bb6dbdeb45f3f470ab0fc335e7352faabe9345a6c14561d492d306b739cf4657fb5b106519682f2b99eb71a7ebda7cd647f2ab88c08f90c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mozaddon-devel rpm_macro(mozilla_addon_install) rpm_macro(mozilla_addondir) rpm_macro(mozilla_firefox_appid) rpm_macro(mozilla_moduledir) rpm_macro(mozilla_mozillapath) rpm_macro(mozilla_pluginsdir) rpm_macro(mozilla_seamonkey_appid) rpm_macro(mozilla_sunbird_appid) rpm_macro(mozilla_thunderbird_appid) rpm_macro(mozilla_unlock_addons)"
RDEPENDS:${PN} += "/usr/bin/perl perl(Archive::Zip) perl(XML::Simple) unzip"

inherit rpm
