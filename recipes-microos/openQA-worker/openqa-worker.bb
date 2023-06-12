SUMMARY = "The openQA worker"
DESCRIPTION = "The openQA worker manages test engine (provided by os-autoinst package)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-worker-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "b87f765398630c98bc2c259a37f0c849e6c4b6f56d624f763ef5d7f05dad2fa0cc9842ac6fd2eef9f59604c1e5e89528ea0a66d1614059c65bd13f5a574fffe4"

RPROVIDES:${PN} += "config(openQA-worker) \
group(_openqa-worker) \
openQA-worker \
openQA-worker(aarch-64) \
perl(OpenQA::CacheService::Client) \
perl(OpenQA::CacheService::Command::run) \
perl(OpenQA::CacheService::Controller::API) \
perl(OpenQA::CacheService::Controller::Influxdb) \
perl(OpenQA::CacheService::Model::Cache) \
perl(OpenQA::CacheService::Model::Downloads) \
perl(OpenQA::CacheService::Plugin::Helpers) \
perl(OpenQA::CacheService::Request) \
perl(OpenQA::CacheService::Request::Asset) \
perl(OpenQA::CacheService::Request::Sync) \
perl(OpenQA::CacheService::Response) \
perl(OpenQA::CacheService::Response::Info) \
perl(OpenQA::CacheService::Response::Status) \
perl(OpenQA::CacheService::Task::Asset) \
perl(OpenQA::CacheService::Task::Sync) \
perl(OpenQA::Worker::App) \
perl(OpenQA::Worker::CommandHandler) \
perl(OpenQA::Worker::Engines::isotovideo) \
perl(OpenQA::Worker::Isotovideo::Client) \
perl(OpenQA::Worker::Job) \
perl(OpenQA::Worker::Settings) \
perl(OpenQA::Worker::WebUIConnection) \
user(_openqa-worker)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
bsdtar \
coreutils \
group(nogroup) \
openQA-client \
openQA-common \
optipng \
os-autoinst \
perl(Capture::Tiny) \
perl(File::Map) \
perl(Minion::Backend::SQLite) \
perl(Mojo::IOLoop::ReadWriteProcess) \
perl(Mojo::SQLite) \
perl(SQL::SplitStatement) \
psmisc \
sqlite3"

inherit rpm
