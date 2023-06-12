SUMMARY = "OWASP ModSecurity Common Rule Set (CRS)"
DESCRIPTION = "ModSecurity™ is a web application firewall engine that provides very little protection on its own. In order to become useful, ModSecurity™ must be configured with rules. In order to enable users to take full advantage of ModSecurity™ out of the box, Trustwave's SpiderLabs is providing a free certified rule set for ModSecurity™ 2.x. Unlike intrusion detection and prevention systems, which rely on signatures specific to known vulnerabilities, the Core Rules provide generic protection from unknown vulnerabilities often found in web applications, which are in most cases custom coded. The Core Rules are heavily commented to allow it to be used as a step-by-step deployment guide for ModSecurity™. \
 \
Core Rules Content \
 \
In order to provide generic web applications protection, the Core Rules use the following techniques: \
 \
HTTP Protection - detecting violations of the HTTP protocol and a locally defined usage policy. \
Real-time Blacklist Lookups - utilizes 3rd Party IP Reputation \
Web-based Malware Detection - identifies malicious web content by check against the Google Safe Browsing API. \
HTTP Denial of Service Protections - defense against HTTP Flooding and Slow HTTP DoS Attacks. \
Common Web Attacks Protection - detecting common web application security attack. \
Automation Detection - Detecting bots, crawlers, scanners and other surface malicious activity. \
Integration with AV Scanning for File Uploads - detects malicious files uploaded through the web application. \
Tracking Sensitive Data - Tracks Credit Card usage and blocks leakages. \
Trojan Protection - Detecting access to Trojans horses. \
Identification of Application Defects - alerts on application misconfigurations. \
Error Detection and Hiding - Disguising error messages sent by the server."
LICENSE = "Apache-2.0"

PV = "2.2.9"

RPM_NAME = "owasp-modsecurity-crs-2.2.9-3.8.noarch.rpm"
RPM_HASH = "1f2010097744444da90b08ee59ded2f3dc94db60895b503bf6d3447939037b84b91621c4728d799a24d9da1da16fc0d04344eea6874f43aaa6856439f33ac164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(owasp-modsecurity-crs) \
owasp-modsecurity-crs"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/lua \
/usr/bin/perl \
apache2-mod_security2"

inherit rpm
