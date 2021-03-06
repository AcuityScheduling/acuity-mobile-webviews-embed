//
//  ViewController.m
//  AcuityWebview
//
//  Created by John Kokkinidis on 19/10/16.
//  Copyright © 2016 Acuity Scheduling, Inc. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController
@synthesize _scheduler;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    [self initScheduler];
}

- (void) initScheduler{
    
    // Read create a NSString object with iframe
    NSString *embedHTML = @"<iframe class='is-embedded' src='https://app.acuityscheduling.com/schedule.php?owner=11266122' width='100%' height='800' frameBorder='0'></iframe><script src='https://embed.acuityscheduling.com/js/embed.js' type='text/javascript'></script>";
    
    // Initialize the html data to webview
    [_scheduler loadHTMLString:embedHTML baseURL:nil];

}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


@end
