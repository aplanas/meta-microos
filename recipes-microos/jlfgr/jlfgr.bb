SUMMARY = "Java look and feel Graphics Repository"
DESCRIPTION = "These pages contain a collection of toolbar button graphics. The \
graphics have been designed specifically for use with the Java look and \
feel. They conform to the Java look and feel Design Guidelines. A set \
of attributes accompanies each graphic. This information can easily be \
used to create Swing Actions. \
 \
As the Human Interface Group, we strive to improve the user experience \
for you and your end-users. This graphics repository provides you with \
professional quality graphics that will save you development time. Your \
end-users benefit by leveraging their knowledge of these graphics and \
terminology across different Java look and feel applications. \
 \
To provide feedback about the graphics repository, send email to the \
Java look and feel Design Team (jlfdesign (at) sun (dot) com)."
LICENSE = "SUSE-Redistributable-Content"

PV = "1.0"

RPM_NAME = "jlfgr-1.0-24.6.noarch.rpm"
RPM_HASH = "0fe861857af4f78e007e2d6cced905720707b48e2162c329a5244d6aa070f243a6bd8a3364da3ff51adf3e8209334d8fd819fcf64011d4b16b798cd46a2203a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlfgr"
RDEPENDS:${PN} += ""

inherit rpm
