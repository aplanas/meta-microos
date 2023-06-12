SUMMARY = "Log4j implementation for Perl"
DESCRIPTION = "Log::Log4perl lets you remote-control and fine-tune the logging behaviour \
of your system from the outside. It implements the widely popular \
(Java-based) Log4j logging package in pure Perl. \
 \
*For a detailed tutorial on Log::Log4perl usage, please read* \
 \
http://www.perl.com/pub/a/2002/09/11/log4perl.html \
 \
Logging beats a debugger if you want to know what's going on in your code \
during runtime. However, traditional logging packages are too static and \
generate a flood of log messages in your log files that won't help you. \
 \
'Log::Log4perl' is different. It allows you to control the number of \
logging messages generated at three different levels: \
 \
  * At a central location in your system (either in a configuration file or in \
the startup code) you specify _which components_ (classes, functions) of \
your system should generate logs. \
 \
  * You specify how detailed the logging of these components should be by \
specifying logging _levels_. \
 \
  * You also specify which so-called _appenders_ you want to feed your log \
messages to ('Print it to the screen and also append it to /tmp/my.log') \
and which format ('Write the date first, then the file name and line \
number, and then the log message') they should be in. \
 \
This is a very powerful and flexible mechanism. You can turn on and off \
your logs at any time, specify the level of detail and make that dependent \
on the subsystem that's currently executed. \
 \
Let me give you an example: You might find out that your system has a \
problem in the 'MySystem::Helpers::ScanDir' component. Turning on detailed \
debugging logs all over the system would generate a flood of useless log \
messages and bog your system down beyond recognition. With 'Log::Log4perl', \
however, you can tell the system: 'Continue to log only severe errors to \
the log file. Open a second log file, turn on full debug logs in the \
'MySystem::Helpers::ScanDir' component and dump all messages originating \
from there into the new log file'. And all this is possible by just \
changing the parameters in a configuration file, which your system can \
re-read even while it's running!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.57"

RPM_NAME = "perl-Log-Log4perl-1.57-1.2.noarch.rpm"
RPM_HASH = "027d4498e98e2cba459a5f35b6554d95baaa7abdb453698ad7af029f69ba7693e3e96495b54442a32335e17bd7af834589ead97bea2a5511be18bb54ede63f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Log4perl) \
perl(Log::Log4perl::Appender) \
perl(Log::Log4perl::Appender::Buffer) \
perl(Log::Log4perl::Appender::DBI) \
perl(Log::Log4perl::Appender::File) \
perl(Log::Log4perl::Appender::Limit) \
perl(Log::Log4perl::Appender::RRDs) \
perl(Log::Log4perl::Appender::Screen) \
perl(Log::Log4perl::Appender::ScreenColoredLevels) \
perl(Log::Log4perl::Appender::Socket) \
perl(Log::Log4perl::Appender::String) \
perl(Log::Log4perl::Appender::Synchronized) \
perl(Log::Log4perl::Appender::TestArrayBuffer) \
perl(Log::Log4perl::Appender::TestBuffer) \
perl(Log::Log4perl::Appender::TestFileCreeper) \
perl(Log::Log4perl::Catalyst) \
perl(Log::Log4perl::Config) \
perl(Log::Log4perl::Config::BaseConfigurator) \
perl(Log::Log4perl::Config::DOMConfigurator) \
perl(Log::Log4perl::Config::PropertyConfigurator) \
perl(Log::Log4perl::Config::Watch) \
perl(Log::Log4perl::DateFormat) \
perl(Log::Log4perl::Filter) \
perl(Log::Log4perl::Filter::Boolean) \
perl(Log::Log4perl::Filter::LevelMatch) \
perl(Log::Log4perl::Filter::LevelRange) \
perl(Log::Log4perl::Filter::MDC) \
perl(Log::Log4perl::Filter::StringMatch) \
perl(Log::Log4perl::InternalDebug) \
perl(Log::Log4perl::JavaMap) \
perl(Log::Log4perl::JavaMap::ConsoleAppender) \
perl(Log::Log4perl::JavaMap::FileAppender) \
perl(Log::Log4perl::JavaMap::JDBCAppender) \
perl(Log::Log4perl::JavaMap::NTEventLogAppender) \
perl(Log::Log4perl::JavaMap::RollingFileAppender) \
perl(Log::Log4perl::JavaMap::SyslogAppender) \
perl(Log::Log4perl::JavaMap::TestBuffer) \
perl(Log::Log4perl::Layout) \
perl(Log::Log4perl::Layout::NoopLayout) \
perl(Log::Log4perl::Layout::PatternLayout) \
perl(Log::Log4perl::Layout::PatternLayout::Multiline) \
perl(Log::Log4perl::Layout::SimpleLayout) \
perl(Log::Log4perl::Level) \
perl(Log::Log4perl::Logger) \
perl(Log::Log4perl::MDC) \
perl(Log::Log4perl::NDC) \
perl(Log::Log4perl::Resurrector) \
perl(Log::Log4perl::Util) \
perl(Log::Log4perl::Util::Semaphore) \
perl(Log::Log4perl::Util::TimeTracker) \
perl-Log-Log4perl"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(File::Path)"

inherit rpm
