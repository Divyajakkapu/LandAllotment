/*package com.truviq.camunda;
import java.util.*;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.TaskService;

public class CompleteUserTaskDelegate  {

  @Override
  void meth1()
   {
    // Get an instance of the TaskService
    TaskService taskService = meth1().getProcessEngineServices().getTaskService();

    // Query the user task you want to complete using its task ID
    Task userTask = taskService.createTaskQuery()
        .taskId("Activity_1l26qxf")
        .singleResult();

    // Complete the user task using the task ID
    taskService.complete(userTask.getId());

    // Optionally, you can provide a set of variables to be set on the process instance as part of completing the user task
    Map<String, Object> variables = new HashMap<>();
    variables.put("variable1", "value1");
    variables.put("variable2", 2);
    taskService.complete(userTask.getId(), variables);
  }
}*/

